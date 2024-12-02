package test;
import java.util.*;
import java.io.*;

public class DongwonStorage {
	private List<Dongwon> list = new ArrayList<>();		// list컬렉션 생성
	private Scanner scanner = new Scanner(System.in);   // 키보드 입력 scanner 생성
	private int counter;
	
	public void showMenu() {
		while(true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 등록하기 | 2. 제품목록 | 3. 수정 및 삭제하기 | 4. 종료하기 ");
			System.out.println("-----------------------------------------------------");
			
			System.out.print("번호선택 :  ");
			String selectNo = scanner.nextLine();        //번호읽기
			switch(selectNo) {
			case "1": registerDongwon(); break;   		 // 제품 등록
            case "2": showDongwons(); break;      		 // 제품 목록 보기
            case "3": modifyendDeleteDongwon(); break;   // 제품 수정 및 삭제
            case "4": System.out.println("프로그램 종료"); return;  // 프로그램 종료
            default: System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
						
			}
		}
	}
	
	// 제품등록하기
	
	public void registerDongwon() {
		try {
			Dongwon dongwon = new Dongwon();
			dongwon.setPno(++counter);
			
			System.out.println("제품이름: ");
			dongwon.setName(scanner.nextLine());
			
			System.out.println("제품가격: ");
			dongwon.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.println("제품 가격재고: ");
			dongwon.setStock(Integer.parseInt(scanner.nextLine()));

			list.add(dongwon);
			System.out.print("제품이 등록되었습니다.");
			
			} catch(Exception e) {
			System.out.println("등록에러: " + e.getMessage());
			}
	}
	// 제품 목록보기
	public void showDongwons() {
		if (list.isEmpty()) {
			System.out.println("등록된 제품이 없습니다.");
			return;
		}
		
		for(Dongwon d : list) {
			System.out.println(d.getPno() + "\t" + d.getName() + "\t"  + d.getPrice() + "\t" + d.getStock());}
	}
	
	// 제품 수정및 삭제하기
	public void modifyendDeleteDongwon() {
		
		if (list.isEmpty()) {
			System.out.println("등록된 제품이 없습니다.");
			return;
		}else {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 수정하기 | 2. 삭제하기 | 3. 초기화면으로 돌아가기");
			System.out.println("-----------------------------------------------------");
			
			System.out.print("번호선택 :  ");
			String selectNo = scanner.nextLine();    //번호읽기
			switch(selectNo) {
			case "1": update(); break;   			 // 수정하기
            case "2": delete(); break;      		 // 삭제하기
            default: System.out.println("잘못된 입력입니다. 다시 시도해주세요."); break;
			}
		}
	}
	//수정하기
	public void update() {
		showDongwons();
		System.out.println("-----------------------------------------------------");
		System.out.println("수정할 번호를 입력하세요: ");
		System.out.println("-----------------------------------------------------");
		int pno = Integer.parseInt(scanner.nextLine());
		for (Dongwon d : list) {
			if(d.getPno() == pno) {
			
			System.out.println("새제품: ");
			d.setName(scanner.nextLine());
			
			System.out.println("새제품가격: ");
			d.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.println("새제품 가격재고: ");
			d.setStock(Integer.parseInt(scanner.nextLine()));

			System.out.print("제품이 수정되었습니다.");
			return;
			}
		}
	}

	//삭제하기
	public void delete() {
		System.out.println("-----------------------------------------------------");
		System.out.println("삭제할 번호를 입력하세요: ");
		System.out.println("-----------------------------------------------------");
		int pno = Integer.parseInt(scanner.nextLine());
		list.remove(pno - 1);								// 인덱스번호여서 -1 을 입력함
		}
	}	
