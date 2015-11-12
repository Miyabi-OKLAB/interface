import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class MousePaint extends Frame
	implements MouseListener, MouseMotionListener{

	/***�e��ϐ���`***/
	Button button1 = new Button("ENTER");		//�����I���p�̃{�^��(button1)
	int x, y;									//�擾������W(x, y)
	int disArr[][] = new int[30][30];			//�o�͗p�z��(disArr)
	int compX, compY;							//���k��̍��W(compX, compY)
	int r = 10;									//�y�����a������p
	int mjNo = 0;								//�����J�E���g(�{�^�������Ƒ�����)
	int count = 0;								//mouseDragged���Ăт����ꂽ��
	int logSampling = 0;						//�\�����Ԉ������߂̕ϐ�
	int lineNo = 0;								//�Ђ������̐�(������ė����ꂽ��)
	int mjLineX[] = new int[65535];				//x���W�\���p�̔z��
	int mjLineY[] = new int[65535];				//y���W�\���p�̔z��
	
	/***�R���X�g���N�^***/
	public MousePaint(){
		super("Mouse Paint");
		setSize(300,350);
		setLocation(100,100);
		setBackground(Color.white);
		
		/*�}�E�X���X�i�[*/
		addMouseListener(this);
		addMouseMotionListener(this);
		
		/*�{�^���ݒu*/
		Panel panel = new Panel();
		panel.setLayout(new BorderLayout());
		add(panel, BorderLayout.SOUTH);
		panel.add(button1);
		
		/*�E�B���h�E���X�i�[*/
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setVisible(true);
	}
	
	/***�}�E�X�������ꂽ��***/
	public void mousePressed(MouseEvent e){
		/*���W�̎擾*/
		x = e.getX();
		y = e.getY();
		/*�n�_�ƍ��W�Ɖ���ڂ����R���\�[���ɕ\��*/
		System.out.println("Start x:"+e.getX()+" y:"+e.getY()+" Line:"+lineNo);
		lineNo++;	//�搔�𑝂₷
	}
	
	/***�}�E�X���h���b�O���ꂽ��***/
	public void mouseDragged(MouseEvent e){
		/*���W�擾*/
		x = e.getX();
		y = e.getY();
		lineDraw(getGraphics());
		
		/*10����W���X�V����邽�тɍ��W(x, y)��\��*/
		mjLineX[count] = x;
		mjLineY[count] = y;
		if(logSampling % 10 == 0){
			System.out.println("("+mjLineX[count]+","+mjLineY[count]+")");
		}
		count++;
		logSampling++;
		
		/*���W��10�Ŋ����Ċۂ߂�(���k)*/
		compX = (int)Math.floor(((double)x)/10);
		compY = (int)Math.floor(((double)y-20)/10);
		
		/*�ۂ߂����W�𒆐S�ɔ��ar�܂ł��y�������Ƃ��ĔF��*/
		for(int inX = -10; inX < 10; inX++){
			for(int inY = -10; inY < 10; inY++){
				if(inX*inX+inY*inY < r*r){
					compX = (int)Math.floor(((double)x+inX)/10);
					compY = (int)Math.floor(((double)y+inY-20)/10);
					disArr[compX][compY] = 1;
				}
			}
		}
	}
		
	/***�}�E�X�����ꂽ��***/
	public void mouseReleased(MouseEvent e){
		System.out.println("Line:"+lineNo+" End");//�I�_�̕\��
	}
	
	public void mouseClicked(MouseEvent e){}	//�}�E�X���N���b�N���ꂽ��
	public void mouseExited(MouseEvent e){}		//�}�E�X���̈�O�ɏo����
	public void mouseMoved(MouseEvent e){}		//�}�E�X����������
	public void mouseEntered(MouseEvent e){}	//�̈���Ƀ}�E�X����������
	
	/***x,y�𒆐S�Ƃ������ar�̉~��`��***/
	public void lineDraw(Graphics g){
		g.fillOval(x-r, y-r, 2*r, 2*r);
	}
		
	/***���C���N���X***/
	public static void main(String[] args){
		Frame w = new MousePaint();
		w.setVisible(true);
	}

	/***�擾�����f�[�^��n��***/
	public void sendData(){
		//�����ŃA���S���Y���ǂ̃R�[�h���Ăяo��
	}
		
	/***�{�^���������ꂽ��***/
	public boolean action(Event ev, Object o){
		if(o.equals("ENTER")){
			/*text�t�@�C�������*/
			try{
				File file = new File(".\\mojiVector" + mjNo + ".txt");
				FileWriter filewriter = new FileWriter(file);
				filewriter.write("vector"+mjNo+"\n");
				filewriter.close();
			}catch(IOException iox){
				System.out.println(iox);
			}
			
			/*�v�f�̏o�͕�*/
			for(int i = 0; i < 30 ; i++){
					for(int j = 0; j < 30 ; j++){
						System.out.print(""+disArr[j][i] + " ");
						/*�v�f��text�ɏo�͂���*/
						try{
							File file = new File(".\\mojiVector" + mjNo + ".txt");
							FileWriter filewriter = new FileWriter(file, true);
							filewriter.write(String.valueOf(disArr[j][i]));
							filewriter.close();
						}catch(IOException iox){
							System.out.println(iox);
						}
						
						disArr[j][i] = 0;//�z��̒����ɖ߂�
					}
					System.out.println("");
				}
			
			sendData();		//�A���S���Y���ǂɑ�������
			mjNo++;			//�������J�E���g�𑝂₷
			lineNo = 0;		//�搔�J�E���g��0��
			repaint();		//�`��̈�̏�����
		}
		return true;
	}
}