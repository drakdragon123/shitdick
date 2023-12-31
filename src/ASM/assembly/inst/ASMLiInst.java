//package assembly.inst;
package src.ASM.assembly.inst;
import src.ASM.assembly.operand.*;

public class ASMLiInst extends ASMInst {
  public VirtualImm pseudoImm;

  public ASMLiInst(Reg rd, VirtualImm imm) {
    this.rd = rd;
    this.pseudoImm = imm;
  }

  @Override
  public String toString() {
    return "li " + rd + ", " + pseudoImm;
  }
}