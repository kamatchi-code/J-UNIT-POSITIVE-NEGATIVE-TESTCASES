package itlearnpositivenegativetestcases;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import ecommerce.Dashboard;
import junit.Signup;
import junit.Username;

public class JunitRunAll {
	
	
	
	
	@Test
	public  void test() {
		
	Result rs = JUnitCore.runClasses(JunitUser.class,JunitUser1.class);
	System.out.println("run time"+rs.getRunCount());
	
	System.out.println("failure time"+rs.getFailureCount());
	List<Failure> Fa = rs.getFailures();
	for (Failure x : Fa) {
		System.out.println(x);
		
		
	}
		
	}
	
}
