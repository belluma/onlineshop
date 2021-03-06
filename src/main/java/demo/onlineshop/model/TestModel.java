package demo.onlineshop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="test")
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String testProperty;
    private long testNumber;

    public TestModel(String testProperty, long testNumber) {
        this.testProperty = testProperty;
        this.testNumber = testNumber;
    }

    public TestModel() {

    }

    public long getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(long testNumber) {
        this.testNumber = testNumber;
    }

    public String getTestProperty() {
        return testProperty;
    }

    public void setTestProperty(String testProperty) {
        this.testProperty = testProperty;
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "testProperty='" + testProperty + '\'' +
                ", testNumber=" + testNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestModel testModel = (TestModel) o;
        return testNumber == testModel.testNumber && Objects.equals(testProperty, testModel.testProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testProperty, testNumber);
    }
}
