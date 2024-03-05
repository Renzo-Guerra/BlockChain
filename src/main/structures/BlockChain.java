package structures;

import java.util.ArrayList;
import structures.Block;
import com.google.gson.*;

public class BlockChain {
	public ArrayList<Block> blockChain;
	
	public NoobChain() {
		this.blockChain = new ArrayList<>();
	}
}