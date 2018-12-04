package mode.reader;


/**
 * 该类是适配的结果，适配的是InputStream的specRead()功能，让其有Reader.read()功能
 * @author zhoufe
 * @date 2018/12/4 15:26
 */
public class InputStreamReaderAdapteResult extends InputStream implements Reader {
    @Override
    public void read() {
        specRead();
    }
}
