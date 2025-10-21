
package arep.parcial.mathServices;

public class service {
    
    private String method;
    private int input;
    private int[] Output;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int[] getOutput() {
        return Output;
    }

    public void setOutput(int[] Output) {
        this.Output = Output;
    }

    public service() {
    }

    public service(String method, int input, int[] Output) {
        this.method = method;
        this.input = input;
        this.Output = Output;
    }
    
    
    
}
