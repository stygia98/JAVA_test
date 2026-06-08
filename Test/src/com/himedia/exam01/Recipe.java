package com.himedia.exam01;

import java.util.Arrays;
import java.util.Objects;

public class Recipe {
	private String recipeName;
	
	private String[] ingredients; //재료
	private int ingredientCount; //재료개수
	
	private String[] steps; //요리과정
	private int stepCount; //과정횟수
	
	//디폴트 생성자
	public Recipe() {
		this(null);
	}
	//메개변수 생성자
	public Recipe(String recipeName) {
		super();
		this.recipeName = recipeName;
		ingredients = new String[5];
		ingredientCount = 0;
		steps = new String[5];
		stepCount = 0;
	}
	//매개변수 생성자
	public Recipe(String recipeName, String[] ingredients, int ingredientCount, String[] steps, int stepCount) {
		super();
		this.recipeName = recipeName;
		this.ingredients = ingredients;
		this.ingredientCount = ingredientCount;
		this.steps = steps;
		this.stepCount = stepCount;
	}
	
	//get함수 set함수
	public String getRecipeName() {return recipeName;}
	public void setRecipeName(String recipeName) {this.recipeName = recipeName;}
	public String[] getIngredients() {return ingredients;}
//	public void setIngredients(String[] ingredients) {this.ingredients = ingredients;}
	public int getStepCount() {return stepCount;}
//	public void setStepCount(int stepCount) {this.stepCount = stepCount;}
	public int getIngredientCount() {return ingredientCount;}
	public String[] getSteps() {return steps;}

	//재료추가함수
	public void addIngredient(String ingredientName) {
		if (ingredientCount >=5 ) {
			System.out.println("재료 공간 부족");
			return;
		} // end if
		ingredients[ingredientCount++] = ingredientName;
	}
	
	//요리과정추가함수
	public void addStep(String stepDescription) {
		if (stepCount >=5 ) {
			System.out.println("재료 공간 부족");
			return;
		} // end if
		steps[stepCount++] = stepDescription;
	}
	
	//? 미구현
	public void showRecipe() {
		
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Recipe)) {
			System.out.println("잘못 입력");
			return false;
		}
		Recipe recipe = (Recipe)obj;
		if (this.recipeName.equals(recipe.recipeName) && this.getIngredientCount() == recipe.ingredientCount ) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
//		return recipeName.hashCode() + ingredientCount;
		return Objects.hash(recipeName, ingredientCount);
	}
	
	//전체 출력
	@Override
	public String toString() {
		return "Recipe \n[recipeName=" + recipeName + ",\ningredients=" + Arrays.toString(ingredients)
				+ ", ingredientCount=" + ingredientCount + ", \nsteps=" + Arrays.toString(steps) + ", stepCount="
				+ stepCount + "]";
	}
	
	
	
	
}
