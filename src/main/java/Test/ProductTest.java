package Test;

import javax.persistence.*;

@Entity
public class ProductTest {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private MemberTest memberTest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MemberTest getMemberTest() {
        return memberTest;
    }

    public void setMemberTest(MemberTest memberTest) {
        this.memberTest = memberTest;
    }
}
