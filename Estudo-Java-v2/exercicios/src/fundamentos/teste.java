package fundamentos;
import java.util.ArrayList; import java.util.List;

public class teste {
 
	

	
	String ruleStart[] = { "(", "[", "{" };
	String ruleEnd[] = { ")", "]", "}" };
	int ordem = 0;

	public double calculate(String subExpression) {
	    if (subExpression.contains(ruleStart[ordem]) && subExpression.contains(ruleEnd[ordem])) {
	        return calculate(subExpression.substring(subExpression.indexOf(ruleStart[ordem]) + 1,
	                subExpression.lastIndexOf(ruleEnd[ordem])));
	    } else {
	        ordem++;
	        if (subExpression.contains(ruleStart[ordem]) && subExpression.contains(ruleEnd[ordem])) {
	            subExpression = subExpression.substring(subExpression.indexOf(ruleStart[ordem] + 1),
	                    subExpression.lastIndexOf(ruleEnd[ordem]));

	            return calculate(subExpression);
	        } else {
	            ordem++;
	            if (subExpression.contains(ruleStart[ordem]) && subExpression.contains(ruleEnd[ordem])) {
	                subExpression = subExpression.substring(subExpression.indexOf(ruleStart[ordem] + 1),
	                        subExpression.lastIndexOf(ruleEnd[ordem]));

	                return calculate(subExpression);
	            } else {
	                System.out.println(subExpression);
	                return resolveBasic(subExpression);
	            }

	        }
	    }
	}

	private double resolveMultiplicacaoDivisao(String terms) {

	    double res = 0;
	    String subTerms[] = terms.split("\\*|/");

	    if (terms.contains("^") || terms.contains("root")) {

	        for (int i = 0; i < subTerms.length; i++) {

	            if (subTerms[i].contains("^")) {
	                String el[] = subTerms[i].split("\\^");

	                for (int j = el.length - 1; j > 0; j--) {
	                    if (j - 1 >= 0) {

	                        el[j - 1] = Math.pow(Integer.parseInt(el[j - 1]), Integer.parseInt(el[j])) + "";
	                    }

	                }
	                subTerms[i] = el[0];

	            } else if (subTerms[i].contains("root")) {

	            }

	        }
	    }
	    List<String> ops = new ArrayList<>();
	    char charTerms[] = terms.toCharArray();
	    for (int i = 0; i < charTerms.length; i++) {
	        if (charTerms[i] == '*') {
	            ops.add("*");
	        } else if (charTerms[i] == '/') {
	            ops.add("/");
	        }
	    }

	    double resul; // variavel auxilidora, guarda valores temporarios.
	    if (terms.contains("*") || terms.contains("\\")) {

	        for (int i = 0; i < ops.size(); i++) {

	            if (ops.get(i).equals("*")) {
	                resul = Double.parseDouble(subTerms[i]) * Double.parseDouble(subTerms[i + 1]);
	                subTerms[i + 1] = String.valueOf(resul);

	            } else if (ops.get(i).equals("/")) {

	                resul = Double.parseDouble(subTerms[i]) / Double.parseDouble(subTerms[i + 1]);
	                subTerms[i + 1] = String.valueOf(resul);
	            }
	        }

	        res = Double.valueOf(subTerms[subTerms.length - 1]);
	    } else {
	        return Double.parseDouble(terms);
	    }
	    return res;
	}

	private double resolveBasic(String subExpression) {
	    String[] terms = subExpression.split("\\+|-");
	    List<String> ops = new ArrayList<>();
	    char charTerms[] = subExpression.toCharArray();
	    for (int i = 0; i < charTerms.length; i++) {
	        if (charTerms[i] == '+') {
	            ops.add("+");
	        } else if (charTerms[i] == '-') {
	            ops.add("-");
	        }
	    }

	    double res = resolveMultiplicacaoDivisao(terms[0]);

	    if (ops.size() == 0) {
	        return resolveMultiplicacaoDivisao(terms[0]);
	    }
	    for (int i = 0; i < ops.size(); i++) {
	        if (ops.get(i).equals("+")) {

	            double resul = resolveMultiplicacaoDivisao(terms[i + 1]);
	            System.out.println("RES+: " + resul);

	            res += resul;
	        } else if (ops.get(i).equals("-")) {

	            double resul = resolveMultiplicacaoDivisao(terms[i + 1]);
	            System.out.println("Terms3: " + terms[i + 1]);

	            System.out.println("RES-: " + resul);

	            res = res - resul;
	        }
	    }
	    System.out.println("resultado: " + res);
	    return res;

	}
}
