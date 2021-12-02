package com.cybage.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.cybage.dao.SportsRepository;
import com.cybage.dao.UserRepository;
import com.cybage.deccanSports.DeccanSportsApplication;
import com.cybage.model.User;
@RunWith(SpringRunner.class)
@ContextConfiguration
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes =DeccanSportsApplication.class)
public class AdminServiceImplTest {
	
	
//	@Configuration
//	static class AdminServiceTestContextConfiguration {
//		@Bean
//		public IAdminService adminService() {
//			return new AdminServiceImpl();
//		}
//		
//		@Bean
//		public SportsRepository sportRepository() {
//			return Mockito.mock(SportsRepository.class);
//		}
//	}
	
	@Autowired
	private IAdminService adminService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SportsRepository sportRepository;
	
//	@Test
//	void testAddSports() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testEditSports() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteSportsById() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testAddManager() {
//		IAdminService adminService = new AdminServiceImpl();
//		User user = new User(8, "Ravina", "ravina123", "Ravina Patil", "ravina@gmail.com", "9896652341",
//				UserRole.MANAGER, "pune", "O+", 26, Gender.FEMALE, LocalDate.now(),
//				"Boxing", 0);
//		assertEquals(26,adminService.addManager(user).getAge());
//		System.out.println("Before all test cases");
//	}

//	@Test
//	void testEditManager() {
//		fail("Not yet implemented");
//	}

//	@Test
//	void testDeleteManagerById() {
//	   IAdminService adminService = new AdminServiceImpl();
//		assertEquals(true, adminService.deleteManagerById(2));
//	}

//	@Test
//	void testGetSportsById() {
//		IAdminService adminService = new AdminServiceImpl();
//		assertEquals("Badmintan", adminService.getSportsById(2).getSportsName());
//	}
	
	
//	@Test
//	public void testGetSportsById() {
//		User user = new User(8, "Ravina", "ravina123", "Ravina Patil", "ravina@gmail.com", "9896652341",
//				UserRole.MANAGER, "pune", "O+", 26, Gender.FEMALE, LocalDate.now(),
//				"Boxing", 0);
//		Sports sport = new Sports
//				(1,"Boxing", SportsCategory.INDOOR, " ", LocalDate.now(), user );
////			assertEquals(sport, adminService.getSportsById(sport.getSportsId()));
//			Optional<Sports> returnSport = sportRepository.findById(1);
//			 Assertions.assertTrue(returnSport.isPresent(), "sport id was not found");
//		        Assertions.assertSame(returnSport.get(), sport.getSportsId(), "The sport Id returned was not the same as the mock");
//			}
//	
//
	@Test
	public void testGetManagerById() {
		System.out.println(adminService);
		User user = userRepository.findById(2).get();
		if(user!=null)
			assertEquals(24, user.getAge());
	}

}


