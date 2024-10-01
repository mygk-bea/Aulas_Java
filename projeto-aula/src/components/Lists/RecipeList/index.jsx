import './RecipeList.css';
import { recipes } from './data.js';

export default function RecipeList() {
  return (
    <div className='container_recipes'>
      <div className="item">
        <h1>Recipes</h1>
        {recipes.map(recipe =>
          <div key={recipe.id}>
            {/* key externa para dividir cada receita */}
            <h2>{recipe.name}</h2>
            <ul>
              {recipe.ingredients.map(ingredient => 
                <li key={ingredient}>
                  {ingredient}
                </li>
              )}
            </ul>
          </div>
        )}
      </div>
    </div>
  );
}