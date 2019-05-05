package spring.toy2.SpEL;

import org.springframework.stereotype.Component;

@Component
public class Sample {
    private int data = 1001;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
