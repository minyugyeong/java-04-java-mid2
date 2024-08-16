package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
//        Member member = null;
//        for (String key : memberMap.keySet()) {
//            if (memberMap.get(key).getName().equals(name)) {
//                member = memberMap.get(key);
//            }
//        }
//        return member;
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
