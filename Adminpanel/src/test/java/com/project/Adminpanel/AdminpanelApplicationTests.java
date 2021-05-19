package com.project.Adminpanel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.admin_panel.model.Packages;
import com.project.admin_panel.model.Review;
import com.project.admin_panel.repository.ReviewRepository;
import com.project.admin_panel.resource.AdminController;

@SpringBootTest
class AdminpanelApplicationTests {
	@Autowired AdminController control; @Autowired ReviewRepository reviewrepo;

	@Test
	void viewratingtest() {
		List<Review> actual=control.showreview();
		List<Review> expected=reviewrepo.findAll();
		assertEquals(actual,expected);
	}
	@Test
	void deleterating() {
		String name="seema";
		String actual=control.deleterating(name);
		String expected="Deleted Review "+name;
		assertEquals(actual,expected);
		
		String name1="simran";
		String actual1=control.deleterating(name1);
		String expected1="Review not exist for Name"+name;
		assertEquals(actual1,expected1);
		
		String name2="ram";
		String actual2=control.deleterating(name2);
		String expected2="Deleted Review "+name;
		assertEquals(actual2,expected2);
	}
	@Test
	void addingpackagetest() {
		Packages pack=new Packages(430,"Advance cleaning");
		String actual=control.addingpackage(pack);
		String expected=pack.toString();
		assertEquals(actual,expected);
		
		Packages pack1=new Packages(430,null);
		String actual1=control.addingpackage(pack1);
		String expected1="Details cannot be empty";
		assertEquals(actual1,expected1);
		
		Packages pack2=new Packages(0,"Complete washing");
		String actual2=control.addingpackage(pack2);
		String expected2="Details cannot be empty";
		assertEquals(actual2,expected2);
	}
	@Test
	void deletepackage() {
		String packagename="Complete Washing";
		String actual=control.deletepackage(packagename);
		String expected="Deleted"+packagename;
		assertEquals(actual,expected);
		
		String packagename1="Basic and addons Washing";
		String actual1=control.deletepackage(packagename1);
		String expected1="Package Not Available"+packagename;
		assertEquals(actual1,expected1);
		
		String packagename2="Basic Washing";
		String actual2=control.deletepackage(packagename2);
		String expected2="Deleted"+packagename2;
		assertEquals(actual2,expected2);
	}

}
