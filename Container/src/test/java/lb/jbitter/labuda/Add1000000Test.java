package lb.jbitter.labuda;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Add1000000Test {

    @BeforeAll
    static void warmUp() throws InterruptedException {
        for (int i = 1; i < 20; i++){
            Add1000000.populateArrayByListWithPredictedSize();
            Add1000000.populateArrayByListWithDefaultSize();
            Thread.sleep(10);
        }
    }

    @BeforeEach
    void gc() throws InterruptedException {
        System.gc();
        Thread.sleep(10);
        System.gc();
        Thread.sleep(10);
    }

    @Test @Order(0)
    void doNothing() {
        // nop
    }


    @Test @Order(1)
    void oneMillionListWithPredictedSize() {
        long t1 = System.nanoTime();
        List<Long> list = Add1000000.populateListWithPredictedSize();
        long t2 = System.nanoTime();
        System.out.println("List with predicted size: " + ((t2-t1)/1_000_000) + " ms");
        assertThat(list).hasSize(1_000_000);
    }

    @Test @Order(2)
    void oneMillionListWithDefaultSize() {
        long t1 = System.nanoTime();
        List<Long> list = Add1000000.populateListWithDefaultSize();
        long t2 = System.nanoTime();
        System.out.println("List with default size: " + ((t2-t1)/1_000_000) + " ms");
        assertThat(list).hasSize(1_000_000);
    }

    @Test @Order(3)
    void oneMillionArrayWithPredictedSize() {
        long t1 = System.nanoTime();
        Long[] array = Add1000000.populateArrayByListWithPredictedSize();
        long t2 = System.nanoTime();
        System.out.println("Array with predicted size: " + ((t2-t1)/1_000_000) + " ms");
        assertThat(array).hasSize(1_000_000);
    }

    @Test @Order(4)
    void oneMillionArrayWithDefaultSize() {
        long t1 = System.nanoTime();
        Long[] array = Add1000000.populateArrayByListWithDefaultSize();
        long t2 = System.nanoTime();
        System.out.println("Array with default size: " + ((t2-t1)/1_000_000) + " ms");
        assertThat(array).hasSize(1_000_000);
    }

}
