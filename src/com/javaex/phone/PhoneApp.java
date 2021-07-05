package com.javaex.phone;

import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {

		PhoneDao phoneDao = new PhoneDao();
		List<PersonVo> personList;

		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("=========전화번호 관리 시스템=========");

		while (flag) {

			System.out.println("1.리스트 2.등록 3.수정 4.삭제 5.검색 6.종료");
			System.out.println("-------------------------------------");
			System.out.print(">메뉴번호 : ");
			int m_num = sc.nextInt();

			switch (m_num) {
			
			//리스트
			case 1:
				   System.out.println("<1.리스트>");
				   personList = phoneDao.getPersonList();
				   printList(personList);
				   break;
			//등록
			case 2:
				   System.out.println("<2.등록>");
				   System.out.print("이름 > ");
				   String r_name = sc.next();
				   System.out.print("휴대전화 > ");
				   String r_hp = sc.next();
				   System.out.print("회사번호 > ");
				   String r_company = sc.next();
				   
				   PersonVo ipersonVo = new PersonVo(r_name,r_hp,r_company);
				   phoneDao.personInsert(ipersonVo);
				   
				   break;
			//수정	   
			case 3:
				   System.out.println("<3.수정>");
				   System.out.print("번호 > ");
				   int u_num = sc.nextInt();
				   System.out.print("이름 > ");
				   String u_name = sc.next();
				   System.out.print("휴대전화 > ");
				   String u_hp = sc.next();
				   System.out.print("회사번호 > ");
				   String u_company = sc.next();
				   
				   PersonVo upersonVo = new PersonVo(u_num,u_name,u_hp,u_company);
				   phoneDao.personUpdate(upersonVo);
				   
				   break;
			//삭제	   
			case 4:
				   System.out.println("<4.삭제>");
				   System.out.print(">번호 : ");
				   int d_num = sc.nextInt();
				   
				   phoneDao.personDelete(d_num);
				   
				   break;
			//검색	   
			case 5:
				   System.out.println("<5.검색>");
				   String s_String = sc.next();
				   PersonVo spersonVo = new PersonVo(s_String,s_String,s_String);
				   
				   
				   break;
			//종료	   
			case 6:
				   System.out.println("=========감사합니다=========");
				   flag = false;
				   break;
			//없는 번호	   
			default:
				   System.out.println("[다시 입력해주세요.]");
				   break;
			}

		}
		
		sc.close();
	}

	public static void printList(List<PersonVo> personList) {

		for (PersonVo personVo : personList) {
			System.out.println(personVo.getPresonId() + ". \t" + personVo.getName() + "\t\t" + personVo.getHp()
					+ "\t\t\t" + personVo.getCompany());
		}

	}
	
	
}


