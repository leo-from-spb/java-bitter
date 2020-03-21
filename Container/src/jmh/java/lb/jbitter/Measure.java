package lb.jbitter;

import lb.jbitter.labuda.Add1000000;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1)
@Warmup(iterations = 1)
@Measurement(iterations = 3, timeUnit = TimeUnit.MILLISECONDS)
public class Measure {


    @Benchmark
    public void measurePopulatingListWithPredictedSize() {
        Add1000000.populateListWithPredictedSize();
    }

    @Benchmark
    public void measurePopulatingListWithDefaultSize() {
        Add1000000.populateListWithDefaultSize();
    }

    @Benchmark
    public void measurePopulatingArrayByListWithPredictedSize() {
        Add1000000.populateArrayByListWithPredictedSize();
    }

    @Benchmark
    public void measurePopulatingArrayByListWithDefaultSize() {
        Add1000000.populateArrayByListWithDefaultSize();
    }


}
