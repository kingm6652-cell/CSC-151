import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;

public class players {
    public players() {
        JFrame frame = new JFrame("Players");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Team");

        // Positions
        DefaultMutableTreeNode quarterbacks = new DefaultMutableTreeNode("Quarterbacks");
        DefaultMutableTreeNode linebackers = new DefaultMutableTreeNode("Linebackers");
        DefaultMutableTreeNode cornerbacks = new DefaultMutableTreeNode("Cornerbacks");
        DefaultMutableTreeNode safeties = new DefaultMutableTreeNode("Safeties");
        DefaultMutableTreeNode wideReceivers = new DefaultMutableTreeNode("Wide Receivers");
        DefaultMutableTreeNode tightEnds = new DefaultMutableTreeNode("Tight Ends");
        DefaultMutableTreeNode tackles = new DefaultMutableTreeNode("Tackles");
        DefaultMutableTreeNode guardsTackles = new DefaultMutableTreeNode("Guards/Tackles");

        // Players 14 - 23
        DefaultMutableTreeNode JoshJobe = new DefaultMutableTreeNode("Josh Jobe");
        DefaultMutableTreeNode ErnestJones = new DefaultMutableTreeNode("Ernest Jones IV");
        DefaultMutableTreeNode JoshJones = new DefaultMutableTreeNode("Josh Jones");
        DefaultMutableTreeNode NickKallerup = new DefaultMutableTreeNode("Nick Kallerup");
        DefaultMutableTreeNode TyriceKnight = new DefaultMutableTreeNode("Tyrice Knight");
        DefaultMutableTreeNode CooperKupp = new DefaultMutableTreeNode("Cooper Kupp");
        DefaultMutableTreeNode DeMarcusLawrence = new DefaultMutableTreeNode("DeMarcus Lawrence");
        DefaultMutableTreeNode DrewLock = new DefaultMutableTreeNode("Drew Lock");
        DefaultMutableTreeNode JulianLove = new DefaultMutableTreeNode("Julian Love");
        DefaultMutableTreeNode AbrahamLucas = new DefaultMutableTreeNode("Abraham Lucas");
        
         // Player 39 -53
        DefaultMutableTreeNode BradyRussell = new DefaultMutableTreeNode("Brady Russell");
        DefaultMutableTreeNode EricSaubert = new DefaultMutableTreeNode("Eric Saubert");
        DefaultMutableTreeNode RashidShaheed = new DefaultMutableTreeNode("Rashid Shaheed");
        DefaultMutableTreeNode JaxonSmithNjigba = new DefaultMutableTreeNode("Jaxon Smith-Njigba");
        DefaultMutableTreeNode ChrisStoll = new DefaultMutableTreeNode("Chris Stoll");
        DefaultMutableTreeNode JalenSundell = new DefaultMutableTreeNode("Jalen Sundell");
        DefaultMutableTreeNode ChazzSurratt = new DefaultMutableTreeNode("Chazz Surratt");
        DefaultMutableTreeNode DrakeThomas = new DefaultMutableTreeNode("Drake Thomas");
        DefaultMutableTreeNode KennethWalker = new DefaultMutableTreeNode("Kenneth Walker III");
        DefaultMutableTreeNode LeonardWilliams = new DefaultMutableTreeNode("Leonard Williams");
        DefaultMutableTreeNode DevonWitherspoon = new DefaultMutableTreeNode("Devon Witherspoon");
        DefaultMutableTreeNode RiqWoolen = new DefaultMutableTreeNode("Riq Woolen");
        DefaultMutableTreeNode DarekeYoung = new DefaultMutableTreeNode("Dareke Young");
        DefaultMutableTreeNode GreyZabel = new DefaultMutableTreeNode("Grey Zabel");

        // Build tree (group by position)
        quarterbacks.add(DrewLock);
        linebackers.add(ErnestJones);
        linebackers.add(TyriceKnight);
        linebackers.add(DeMarcusLawrence);
        linebackers.add(ChazzSurratt);
        linebackers.add(DrakeThomas);
        cornerbacks.add(JoshJobe);
        cornerbacks.add(DevonWitherspoon);
        cornerbacks.add(RiqWoolen);
        safeties.add(JulianLove);
        wideReceivers.add(CooperKupp);
        wideReceivers.add(RashidShaheed);
        wideReceivers.add(JaxonSmithNjigba);
        wideReceivers.add(DarekeYoung);
        tightEnds.add(NickKallerup);
        tightEnds.add(EricSaubert);
        tackles.add(AbrahamLucas);
        tackles.add(GreyZabel);

            // Add other positions
            DefaultMutableTreeNode fullbacks = new DefaultMutableTreeNode("Fullbacks");
            fullbacks.add(BradyRussell);
            DefaultMutableTreeNode longSnappers = new DefaultMutableTreeNode("Long Snappers");
            longSnappers.add(ChrisStoll);
            DefaultMutableTreeNode centers = new DefaultMutableTreeNode("Centers");
            centers.add(JalenSundell);
            DefaultMutableTreeNode runningBacks = new DefaultMutableTreeNode("Running Backs");
            runningBacks.add(KennethWalker);
            DefaultMutableTreeNode defensiveTackles = new DefaultMutableTreeNode("Defensive Tackles");
            defensiveTackles.add(LeonardWilliams);
        guardsTackles.add(JoshJones);

        root.add(quarterbacks);
        root.add(linebackers);
        root.add(cornerbacks);
        root.add(safeties);
        root.add(wideReceivers);
        root.add(tightEnds);
        root.add(tackles);
        root.add(guardsTackles);
        root.add(fullbacks);
        root.add(longSnappers);
        root.add(centers);
        root.add(runningBacks);
        root.add(defensiveTackles);

        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new players());
    }
}
