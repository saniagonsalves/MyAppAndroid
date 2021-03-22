package sjsu.cmpelkk.myappandroid

import android.net.Uri
import java.io.Serializable

data class DataItem(
    val name: String,
    val title: String,
    val story: String,
    val highlight: Boolean = false,
    val rating: Int,
    val imagename: String //Int, //String?
): Serializable

public val carddefaultdata = listOf<DataItem>(
        DataItem("Burger", "Burger", "Make a burger using bread and meat patty \n \n \n Ingredients: \n \n Bread \n \n Cheese \n \n Veggies \n \n Meat Patty \n \n Sauce \n\n  ", false, 4, Uri.parse("android.resource://sjsu.cmpelkk.myappandroid" + "/" + R.drawable.burger).toString()),
        DataItem("Sandwich", "Sandwich", "Make a sandwich using sliced bread and veggies", false, 4, Uri.parse("android.resource://sjsu.cmpelkk.myappandroid" + "/" + R.drawable.sandwich).toString()),
        DataItem("Pancakes", "Pancakes", "Make pancake using pancake batter and maple syrup", false, 4, Uri.parse("android.resource://sjsu.cmpelkk.myappandroid" + "/" + R.drawable.pancakes).toString()),
        DataItem("Dessert", "Dessert", "Make dessert using chocolate and decorate with berries", false, 4, Uri.parse("android.resource://sjsu.cmpelkk.myappandroid" + "/" + R.drawable.dessert).toString())
)
