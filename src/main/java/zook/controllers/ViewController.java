package zook.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

	/**Forwards user to create new account page.
	 * @return
	 */
	@GetMapping(value="/signup")
	public static String goToCreateAccount() {
		return "/html/createaccount.html";
	}
	
	 @GetMapping(value="/home")
	 public static String goToProfilePage() {
		System.out.println("view controller go to profile page called");
		return "/html/userprofile.html";
	 }
	
//	@GetMapping(value="/home")
//	public static String goToProfilePage() {
//		System.out.println("view controller go to profile page called");
//		return "/html/feedpage.html";//return "/html/userprofile.html";
//	}
	
	@GetMapping(value="/index")
	public static String goToIndexPage() {
		return "/media/index.html";
	}
	
	/**Forwards user to request password reset link via email.
	 * @return
	 */
	@GetMapping(value="/recover")
	public static String goToRequestResetLink() {
		System.out.println("get /recover requested");
		return "/html/requestPwReset.html";
	}
	
	
}
