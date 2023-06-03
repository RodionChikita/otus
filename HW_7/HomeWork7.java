import javax.sql.DataSource;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

public class HomeWork7 {
  public static void main(String[] args) {
    DataSource dataSource =
        new DataSource() {
          @Override
          public Connection getConnection() throws SQLException {
            return null;
          }

          @Override
          public Connection getConnection(String username, String password) throws SQLException {
            return null;
          }

          @Override
          public PrintWriter getLogWriter() throws SQLException {
            return null;
          }

          @Override
          public void setLogWriter(PrintWriter out) throws SQLException {}

          @Override
          public void setLoginTimeout(int seconds) throws SQLException {}

          @Override
          public int getLoginTimeout() throws SQLException {
            return 0;
          }

          @Override
          public <T> T unwrap(Class<T> iface) throws SQLException {
            return null;
          }

          @Override
          public boolean isWrapperFor(Class<?> iface) throws SQLException {
            return false;
          }

          @Override
          public Logger getParentLogger() throws SQLFeatureNotSupportedException {
            return null;
          }
        };
    TryWithResources.doAnyWork(dataSource);
    ExceptionOutput.doAnyWork();
    ExeptionRethrow.doAnyHighLevelWork();
    ExceptionDisclamer.doAnyWork();
  }
}


class TryWithResources {
  public static void doAnyWork(DataSource dataSource) {
    ClassLoader classLoader = dataSource.getClass().getClassLoader();
    try (Connection conn = dataSource.getConnection();
        InputStream stream = classLoader.getResourceAsStream("/file.txt")) {
      throw new Exception("Something bad happend");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class ExceptionOutput {
  public static void doAnyWork() {
    try {
      throw new Exception("Oops!");
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }
}

class ExceptionDisclamer {
  public static void doAnyWork() {
    try {
      throw new Exception("Oops!");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

class ExeptionRethrow {
  public static void doAnyHighLevelWork() {
    try {
      try {
        try {
          throw new LowLevelException("Что-то произошло в глубинах кода");
        } catch (Exception e) {
          throw new HighLevelException1("Что-то произошло чуть выше глубин кода", e);
        }
      } catch (Exception e) {
        throw new HighLevelException2("Что-то произошло близко с самым верхам кода", e);
      }
    } catch (Exception e) {
      try {
        throw new HighLevelException3("Что-то произошло на самом верху", e);
      } catch (Exception e1) {
        e1.printStackTrace();
      }
    }
  }
}

class LowLevelException extends Exception {

  public LowLevelException(String message) {
    super(message);
  }
}

class HighLevelException1 extends Exception {
  public HighLevelException1(String message, Throwable cause) {
    super(message, cause);
  }
}

class HighLevelException2 extends Exception {
  public HighLevelException2(String message, Throwable cause) {
    super(message, cause);
  }
}

class HighLevelException3 extends Exception {
  public HighLevelException3(String message, Throwable cause) {
    super(message, cause);
  }
}
