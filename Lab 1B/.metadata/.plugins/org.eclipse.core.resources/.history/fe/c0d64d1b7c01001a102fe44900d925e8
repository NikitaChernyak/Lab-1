package lab1B;

public class IceCream extends Food {

	private String sirupFlavour = null;
	
	public IceCream(String sirupFlavour) {
		super("Мороженое");
		this.sirupFlavour = sirupFlavour;
	}
	
	public String getSirupFlavour() {
		return sirupFlavour;
	}

	public void setSirupFlavour(String sirupFlavour) {
		this.sirupFlavour = sirupFlavour;
	}

	@Override
	public String toString() {
		return super.toString() + " со вкусом '" + sirupFlavour + "'";
	}
	
	@Override
	public boolean equals(Object arg) {
		if (super.equals(arg)) {
			if (!(arg instanceof IceCream)) return false;
		return sirupFlavour.equals(((IceCream)arg).sirupFlavour);
		}
		else return false;
	}
	
	@Override
	public void consume() {
		System.out.println(this + " съедено");
	}
	
}
