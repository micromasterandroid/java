/*
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.*/

import java.net.*;
import java.io.*;

public class EchoServer{
  public static void main(String[] args) throws IOException {
    if(args.length != 1){
      System.err.println("Usage: java EchoServer <port number>");
      System.exit(1);
    }

    int portNumber = Integer.parseInt(args[0]);

    try{
        ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0]));
        Socket clientSocket = serverSocket.accept();
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
        BufferedReade in = new BufferedReade(new InputStreamReader(clientSocket.getInputStream()));
    }catch(IOException e){
      System.out.println(" Exception caught when trying to listen on port " + portNumber + " or listening for a connection");
      System.out.println(e.getMessage());
    }
  }
}
