public class Doc extends Application {
	public Doc() {} 
	@Override
	protected boolean checkFile(String fileName) {
		//doc ���� �������� Ȯ���Ѵ� 
		return false;
	}

	@Override
	protected boolean processFile(String fileName) {
		//doc ������ �����Ѵ�
		return false;
	}
}
