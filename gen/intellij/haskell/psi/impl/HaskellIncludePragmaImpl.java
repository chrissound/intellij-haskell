// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import intellij.haskell.psi.HaskellGeneralPragmaContent;
import intellij.haskell.psi.HaskellIncludePragma;
import intellij.haskell.psi.HaskellVisitor;
import org.jetbrains.annotations.NotNull;

public class HaskellIncludePragmaImpl extends HaskellCompositeElementImpl implements HaskellIncludePragma {

  public HaskellIncludePragmaImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitIncludePragma(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HaskellGeneralPragmaContent getGeneralPragmaContent() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, HaskellGeneralPragmaContent.class));
  }

}
