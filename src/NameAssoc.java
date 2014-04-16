abstract class NameAssoc<DATA>
{
	String name;
	DATA data;

	NameAssoc(String name, DATA data)
	{
		this.name = name;
		this.data = data;
	}

	void updateDataForName (String forname, DATA newData)
	{

		if (this.name.equals(forname)) {
			this.data = newData;
		}
		return;
	}

	abstract boolean lessThan(NameAssoc<DATA> other);

	abstract boolean equals(NameAssoc<DATA> other);

}