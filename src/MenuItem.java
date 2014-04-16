public class MenuItem extends NameAssoc<Integer>
{
	MenuItem(String name, Integer price)
	{
		super(name, price);
	}

	@Override
	boolean lessThan(NameAssoc<Integer> other)
	{
		return this.data < other.data;
	}
}
