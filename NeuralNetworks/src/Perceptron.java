import java.util.Arrays;

public class Perceptron {
	double bias;
	double threshold;
	double learningRate;
	int numInput;
	double[] weights;
	public Perceptron(double t, int numIn, double lr) {
		threshold = t;
		learningRate = lr;
		weights = new double[numIn];
		bias=0;
		System.out.println("Initial weights: " + Arrays.toString(weights));
		System.out.println("Initial bias: " + bias);
		System.out.println("Threshold: " + threshold);
		System.out.println("LR: " + learningRate);

	}
	public int predict(double[] predicts) {
		int dot = 0;
		
			for(int j = 0; j<weights.length; j++) {
				dot += predicts[j]*weights[j];
			}
		dot += bias;
		if(dot>0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public void train(double[][] trainInputs, int[] labels) {
		for(int i= 0; i<threshold; i++) {
			System.out.println("epoch "+i);
			for(int j = 0; j<labels.length; j++) {
				System.out.println("Current input, weight, bias:" + Arrays.toString(trainInputs[j])+", "+Arrays.toString(weights)+", "+bias);
				int yhat = predict(trainInputs[j]);
				System.out.println("Activation = " + yhat);
				int error = labels[j]-yhat;
				System.out.println("error, label "+ error +", " +labels[j]);
				for(int k = 0; k<weights.length; k++) {
					weights[k] += learningRate*error*trainInputs[j][k];
				}
				bias = learningRate*error;
				System.out.println("Updated weight:"+ Arrays.toString(weights));
				System.out.println("Updated bias: "+ bias);
			}
		}
	}
	public static void main(String[] args) {
		//truth table
		int[] labels= {1,0,0,0};
		
		
		
		double[][] input = {{1.0,1.0},{1.0, 0.0}, {0.0, 1.0}, {0.0,0.0}};
		Perceptron p = new Perceptron(10, 2, 1);
		p.train(input, labels);
		//test
		double[] testMat = {1,1};
		System.out.println("INPUTS: " + Arrays.toString(testMat));
		int output = p.predict(testMat);
		System.out.println("OUTPUT: " + output);
	}
}
