
package eu.doppel_helix.netbeans.mantisintegration;

import eu.doppel_helix.netbeans.mantisintegration.issue.MantisIssue;
import eu.doppel_helix.netbeans.mantisintegration.repository.MantisRepository;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.Collections;
import org.netbeans.modules.bugtracking.api.Repository;
import org.netbeans.modules.bugtracking.issuetable.IssueNode;
import org.netbeans.modules.bugtracking.spi.BugtrackingConnector;
import org.netbeans.modules.bugtracking.spi.IssueStatusProvider;
import org.netbeans.modules.bugtracking.spi.RepositoryInfo;
import org.openide.util.NbBundle;

@BugtrackingConnector.Registration (
        id=MantisConnector.ID,
        displayName="#LBL_ConnectorName",
        tooltip="#LBL_ConnectorTooltip"
)    
public class MantisConnector implements BugtrackingConnector {
    public static final String ID = "eu.doppel_helix.netbeans.mantisintegration";
    
    public static String getConnectorName() {
        return NbBundle.getMessage(MantisConnector.class, "LBL_ConnectorName");           // NOI18N
    }
    
    public MantisConnector() {}
    
    @Override
    public Repository createRepository(RepositoryInfo info) {
        MantisRepository mr = new MantisRepository(info);
        return Mantis.getInstance().getBugtrackingSupport().createRepository(
                mr, null, null, null, null);
    }
    
    @Override
    public Repository createRepository() {
        MantisRepository mr = new MantisRepository();
        return Mantis.getInstance().getBugtrackingSupport().createRepository(
                mr, null, null, null, null);
    }
}