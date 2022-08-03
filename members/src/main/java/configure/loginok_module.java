package configure;

import java.sql.*;


// MVC : Module
public class loginok_module {

   protected Connection ct = null;
   String u = null;
   String n = null;
   String msg = null;

//   public void userinfo(String userid, String userpw) {
//	   this.u = userid;
//	   this.p = userpw;
//   }
   
   public void userid (String userid) {
	   this.u = userid;
   }
   
   public void username (String usernm) {
	   this.n = usernm;
   }
   
   public void message (String msg) {
	   this.msg = msg;
   }
   	
   //class 형태 메소드 getter,setter 위에 static사용 안 하는 이유
   //자료형 구분없이 사용하기 위해서 
   public loginok_module getter(String userid, String userpw) {
      //getter return
      // loginok.java로 보내기 
      loginok_module ld= null;
   
//      String u = userid;
//      String p = userpw;
//      String msg ="ok";
      
      try {
         // dbconfig.java 로드 and throws해주고~!
         dbconfig dc = new dbconfig();
         this.ct = dc.dbcon();
         ld = new loginok_module();	//class 인스턴스 적용
         /*	[중요!] 
          * SQL 문법은 해당 값이 잘못 되었을 경우 또는 필드명이 잘못 될 경우
          * 해당 문법을 세그먼트를 꼭 찍어서 확인 해야 함.
          * 암호화가 있을 경우 무조건 암호화 값이 들어가야만 확인이 정상적으로 이루어 짐.
          * 
          * 헤당 필드 값만 가져와서 사용할 경우 각각의 필드명을 입력하면 됨	*/
         String sql = "select mid,mname from person where mid=? and mpw=?";
         PreparedStatement ps = this.ct.prepareStatement(sql);
         ps.setString(1, userid);
         ps.setString(2, userpw);
         ResultSet rs = ps.executeQuery();
         
         if(rs.next() == false) {
        	 ld.message("nojoin");
         }
         else {
        	 ld.message("okjoin");
         }
         
         
         ld.userid(rs.getString("mid"));	// void  메소드로 this를 적용 시켜줌. loginok.java에서 this값을 바로 load하기 위함
         ld.username(rs.getString("mname"));
      }
      catch(Exception e) {
         
      }
      
      return ld;
   
   }

}