package tacos.data;

import java.util.Optional;

import tacos.Ingredient;

public interface IngredientRepository {
	
	Iterable<Ingredient> findAdd();
	
	Optional<Ingredient> findById(String id);
	
	Ingredient save(Ingredient ingredient);
}
