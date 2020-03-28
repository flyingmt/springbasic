package fastcampus;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class BeanScopeTest {
 //   @Test
 //   void testIdenity() {
        // 동일성(idenity): 객체 주소 같다. (obj1 == obj2 == obj3) == true
        // 동등성(equals): 객체 값이 같다. (obj1.equals(obj2)) == true
  //      A a1 = new A(a1, a2);
  //      A a2 = a1;
  //      Assert.assertTrue(a1 == a2);
  //  }

    @Test
    void testEquals() {
        A a1 = new A(10, "Hello World");
        A a2 = new A(10, "Hello World");
        A a3 = new A(5, "Hello");

        Assert.assertEquals(a1, a2);
        Assert.assertNotEquals(a1, a3);
    }
}

@EqualsAndHashCode
@AllArgsConstructor
class A {
    private int a1;
    private String a2;
}
