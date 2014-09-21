import javax.swing.JFrame;

class Modeler extends JFrame{
	/** 화면 콤포넌트 객체 레퍼런스
	 */ 
	protected GraphicController _controller = null;
	/** 이 프레임의 패키지 이름
	 */
	public String packageName;
	/** 데이타 멤버 packageName에 대한 읽기 access 함수이다.
	 */
	public String getPackageName() {
		return new String(packageName);
	}
	/** 데이타 멤버 _controller에 대한 읽기 access 함수이다.
	 */
	public GraphicController controller() {
		return _controller;
	}

	/** 생성자이다.
	 */	
	public Modeler(String name) {
		super(name);
	}
	
	/** 모델 저자의 이름을 돌려주는 함수이다.
	 */
	public String getAuthorName() {
		return new String("");
	}
	/** 모델 저자의 이름을 설정하는 함수이다.
	 */
	public void setAuthorName(String author) {
	}
}
class ObjectModeler extends Modeler{
	
	public ObjectModeler(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
public class DOM {
	public static void main(String arg[]){
		ObjectModeler modeler = new ObjectModeler("MODELER");
		modeler.setVisible(true);
	}
}
