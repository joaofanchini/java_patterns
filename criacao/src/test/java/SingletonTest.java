import br.com.joaofanchini.pattern.singleton.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testSameInstance(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        Assertions.assertSame(instance1,instance2);
    }

    @Test
    public void testAccessWithRefletion(){
        boolean result = false;
        Class<Singleton> singletonClass = Singleton.class;

        try {
           singletonClass.getConstructor(Void.class)
                    .newInstance();
        } catch(Exception e){
            result = true;
        }

        Assertions.assertTrue(result);
    }

    // TODO: Realizar teste comprovando o Thread Safe
}
