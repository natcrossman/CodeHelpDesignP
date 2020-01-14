
public class SellCommand implements Command {
	
	public String _stockName;
	public int _numShares;
	
	public SellCommand(String stockName, int orderSize) {
		_stockName = stockName;
		_numShares = orderSize;
	}
	
	public void execute() {
		System.out.println("Sold "+_numShares+" shares of "+_stockName);	
	}
	
	public void unexecute() {
		System.out.println("Bought "+_numShares+" shares of "+_stockName);
	}

}
