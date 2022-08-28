package Exerc_01;

public class view {

	public static void main(String[] args) {
		
		RedesController redController = new RedesController();
//		String os = redController.os();
//		System.out.println(os);
//		
//		String process = "C:\\Linux\\Mousepad.exe";
//		redController.callProcess(process);
		
//		String process = "ps -ef";
//		redController.readProcess(process);
		
//		String process = "PING -4 -c 10 www.google.com.br";
//		redController.readProcess(process);
		
//		String process = "ifconfig";
//		redController.readProcess(process);
		
		String param = "cmd.exe";
		redController.killProcess(param);
		
		
		}
}