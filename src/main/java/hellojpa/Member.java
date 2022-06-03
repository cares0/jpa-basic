package hellojpa;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Embedded
    private Period period;

    @Embedded
    private Address homeAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "city", column = @Column("WORK_CITY")),
            @AttributeOverride(name = "street", column = @Column("WORK_STREET")),
            @AttributeOverride(name = "zipcode", column = @Column("WORK_ZIPCODE")),
    })
    private Address workAddress;

}
