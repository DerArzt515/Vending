import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AppTest {
    @Test
    public void test_it() {
        assertThat(App.getIt()).contains("getIt");
    }
}