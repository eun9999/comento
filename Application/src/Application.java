public abstract class Application {
	public final boolean open(String fileName) {
		boolean canRead = false;
		canRead = checkFile(fileName);
		
		if ( canRead == false ) return false;
		
		boolean result = false;
		
		result = processFile(fileName);
		
		return result;
	}
	protected abstract boolean checkFile(String fileName);
	protected abstract boolean processFile(String fileName);
}
