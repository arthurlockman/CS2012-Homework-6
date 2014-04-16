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

	@Override
	boolean equals(NameAssoc<Integer> other)
	{
		return this.name.equals(other.name) && (this.data == other.data);
	}
}
