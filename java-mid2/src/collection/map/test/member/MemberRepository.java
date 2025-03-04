package collection.map.test.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> membersMap = new HashMap<>();

    public void save(Member member1) {
        membersMap.put(member1.getId(), member1);
    }

    public Member findById(String id) {
        return membersMap.get(id);
    }

    public Member findByName(String memberName) {
        /*
        for (Map.Entry<String, Member> string : membersMap.entrySet()) {
            if (string.getValue().getName().equals(memberName)) {
                return membersMap.get(string.getKey());
            }
        }
        System.out.println("not found");
        return null;
        */
        Collection<Member> values = membersMap.values();
        for (Member member : values) {
            if (member.getName().equals(memberName)) {
                return member;
            }
        }
        return null;
    }

    public void remove(String id) {
        membersMap.remove(id);
    }
}
