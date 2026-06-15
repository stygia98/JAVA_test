package chapter16.page03;

public class Goods2 {
	private Pencil pencil;
	
	public Goods2() {
		this(null);
	}

	public Goods2(Pencil pencil) {
		super();
		this.pencil = pencil;
	}

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}
