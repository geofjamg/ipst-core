/**
 * Copyright (c) 2016, All partners of the iTesla project (http://www.itesla-project.eu/consortium)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package eu.itesla_project.commons.tools;

import com.google.auto.service.AutoService;
import eu.itesla_project.commons.Version;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;

/**
 * @author Geoffroy Jamgotchian <geoffroy.jamgotchian at rte-france.com>
 */
@AutoService(Tool.class)
public class VersionTool implements Tool {

    private static final Command COMMAND = new Command() {
        @Override
        public String getName() {
            return "version";
        }

        @Override
        public String getTheme() {
            throw new UnsupportedOperationException();
        }

        @Override
        public String getDescription() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Options getOptions() {
            return new Options();
        }

        @Override
        public String getUsageFooter() {
            return null;
        }

        @Override
        public boolean isHidden() {
            return true;
        }
    };

    @Override
    public Command getCommand() {
        return COMMAND;
    }

    @Override
    public void run(CommandLine line, ToolRunningContext context) throws Exception {
        context.getOutputStream().println(Version.VERSION);
    }
}
