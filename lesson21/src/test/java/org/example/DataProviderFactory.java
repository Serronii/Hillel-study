
package org.example;
import org.testng.annotations.DataProvider;
import org.testng.internal.invokers.Arguments;
import java.util.stream.Stream;

    public class DataProviderFactory {

        @DataProvider(name = "intProvider")
        public Object[][] createData(){
            return new Object[][]{
                    new Object[]{435, 21, 456},
            };
        }


    }

