package com.example.icm_android.test;

import java.util.List;

import android.content.Context;
import android.util.Log;

import com.example.icm_android.db.DBHandler;
import com.example.icm_android.model.Club;
import com.example.icm_android.model.User;

public class TestDb {
	
	public static void testDb(Context context){
		
		DBHandler db = new DBHandler(context);
		
		/*	//--------------------------------------------------------------------------------------------------------
		//测试用户表的读写
		//写
		User user = new User("20132100028", "冼立志", "1234");
		db.addUser(user);
		user = new User("20132100029", "都比比", "1234");
		db.addUser(user);
		//读某个用户
		User testUser = db.getUserByUid("20132100028");
		if(testUser!=null){
			Log.d("Reading", "Reading users..");
			String log = "uid:" + testUser.getUid() + ", name:"  + testUser.getUserName()
					+ ", password:" + testUser.getUserPassword();
			Log.d("user:", log);
		}else{
			Log.d("error>>>>>>>>>>>>>", "没有用户");
		}
		//读取所有的用户
		List<User> userList = db.getAllUser();
		if(userList!=null){
			Log.d("Reading all..", "Reading all users......");
			for(User u: userList){
				String log = "uid:" + u.getUid() + ", name:"  + u.getUserName()
						+ ", password:" + u.getUserPassword();
				Log.d("user:", log);
			}
		}
		//删除某个用户，通过uid
		db.deleteUserByUid("20132100028");
		if(db.getUserByUid("20132100028")==null){
			Log.d("success", ">>>>>>>>>>>>>>成功删除用户数据");
		}else{
			Log.d("unsuccess", ">>>>>>>>>>>>>>失败删除用户数据");
		}
		//更新某个用户信息，通过user
		user = new User("20132100029", "小牧", "1234");
		db.updateUser(user);
		Log.d("update", "更新的结果是>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		testUser = db.getUserByUid("20132100029");
		if(testUser!=null){
			String log = "uid:" + testUser.getUid() + ", name:"  + testUser.getUserName()
					+ ", password:" + testUser.getUserPassword();
			Log.d("更新成功。。。。", log);
		}else{
			Log.d("更新失败", ">>>>>>>>>>>>>>>>>>>>");
		}
		//获取用户个数
		int usersCount = db.getUsersCount();
		Log.d("用户个数：", "用户个数为:"+usersCount);
		
		//--------------------------------------------------------------------------------------------------------------------------
		
				//测试clubs的读写
				//写
				Club club = new Club("01", "小木社团");
				db.addClub(club);
				club = new Club("02", "都比比社团");
				db.addClub(club);
				//读某个社团
				Club testClub = db.getClubByClubId("01");
				if(testUser!=null){
					Log.d("Reading", "Reading clubs..");
					String log = "clubId:" + testClub.getClubId()+", clubName:"+testClub.getClubName();
					Log.d("club:", log);
				}else{
					Log.d("error>>>>>>>>>>>>>", "没有社团");
				}
				//读取所有的社团
				List<Club> userClub = db.getAllClub();
				if(userClub!=null){
					Log.d("Reading all..", "Reading all clubs......");
					for(Club u: userClub){
						String log = "clubId:" + testClub.getClubId()+", clubName:"+testClub.getClubName();
						Log.d("club:", log);
					}
				}
				//删除某个社团，通过clubId
				db.deleteClubByClubId("01");
				if(db.getClubByClubId("01")==null){
					Log.d("success", ">>>>>>>>>>>>>>成功删除社团数据");
				}else{
					Log.d("unsuccess", ">>>>>>>>>>>>>>失败删除社团数据");
				}
				//更新某个社团信息，通过club
				testClub = new Club("02", "都比比社团2");
				db.updateClub(testClub);
				Log.d("update", "更新的结果是>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				testClub = db.getClubByClubId("02");
				if(testClub!=null){
					String log = "clubId:" + testClub.getClubId()+", clubName:"+testClub.getClubName();
					Log.d("更新成功。。。。", log);
				}else{
					Log.d("社团更新失败", ">>>>>>>>>>>>>>>>>>>>");
				}
				//获取用户个数
				int clubCount = db.getClubsCount();
				Log.d("社团个数：", "社团个数为:"+clubCount);
	*/			
				//--------------------------------------------------------------------------------------------------------------------------
				//测试社团和用户表的关系操作
				db.addUser(new User("01", "用户01", null));
				db.addUser(new User("02", "用户02", null));
				db.addClub(new Club("00", "超级社团"));
				db.addClub_User("00", "01");
				db.addClub_User("00", "02");
				List<User> userList2 = db.getAllUsersByClubId("00");
				if(userList2 != null){
					System.out.println("通过clubId找到社团中的所有成员");
					for(User u: userList2){
						String log =  "uid: "+u.getUid()+", userName:"+u.getUserName();
						Log.d("clubs_users", log);
					}
				}else{
					System.out.println("通过clubId不能找到社团中的所有成员");
				}
	}

}
