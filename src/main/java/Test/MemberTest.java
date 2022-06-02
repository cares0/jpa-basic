package Test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class MemberTest {

    @Id @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "memberTest")
    private List<ProductTest> productTests;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProductTest> getProductTests() {
        return productTests;
    }

    public void setProductTests(List<ProductTest> productTests) {
        this.productTests = productTests;
    }
}
