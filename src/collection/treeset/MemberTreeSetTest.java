package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		
		Member memberPark = new Member(1003,"이순신");
		Member memberLee = new Member(1001, "강감찬");
		Member memberSon = new Member(1002, "김유신");
		
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();

	}
}
