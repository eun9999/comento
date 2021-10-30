public class Doc extends Application {
	public Doc() {} 
	@Override
	protected boolean checkFile(String fileName) {
		//doc 파일 포맷인지 확인한다 
		return false;
	}

	@Override
	protected boolean processFile(String fileName) {
		//doc 파일을 실행한다
		return false;
	}
}
