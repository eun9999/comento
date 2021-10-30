
public class Xls extends Application {
	public Xls() {}
	@Override
	protected boolean checkFile(String fileName) {
		//xls 파일 포맷인지 확인한다 
		return false;
	}

	@Override
	protected boolean processFile(String fileName) {
		//xls 파일을 실행한다
		return false;
	}
}
