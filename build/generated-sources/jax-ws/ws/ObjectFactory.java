
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Accamountshow_QNAME = new QName("http://bank/", "accamountshow");
    private final static QName _AccamountshowResponse_QNAME = new QName("http://bank/", "accamountshowResponse");
    private final static QName _Deposit_QNAME = new QName("http://bank/", "deposit");
    private final static QName _DepositResponse_QNAME = new QName("http://bank/", "depositResponse");
    private final static QName _Transaction_QNAME = new QName("http://bank/", "transaction");
    private final static QName _TransactionResponse_QNAME = new QName("http://bank/", "transactionResponse");
    private final static QName _Withdraw_QNAME = new QName("http://bank/", "withdraw");
    private final static QName _WithdrawResponse_QNAME = new QName("http://bank/", "withdrawResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Accamountshow }
     * 
     */
    public Accamountshow createAccamountshow() {
        return new Accamountshow();
    }

    /**
     * Create an instance of {@link AccamountshowResponse }
     * 
     */
    public AccamountshowResponse createAccamountshowResponse() {
        return new AccamountshowResponse();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link TransactionResponse }
     * 
     */
    public TransactionResponse createTransactionResponse() {
        return new TransactionResponse();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Accamountshow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "accamountshow")
    public JAXBElement<Accamountshow> createAccamountshow(Accamountshow value) {
        return new JAXBElement<Accamountshow>(_Accamountshow_QNAME, Accamountshow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccamountshowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "accamountshowResponse")
    public JAXBElement<AccamountshowResponse> createAccamountshowResponse(AccamountshowResponse value) {
        return new JAXBElement<AccamountshowResponse>(_AccamountshowResponse_QNAME, AccamountshowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "depositResponse")
    public JAXBElement<DepositResponse> createDepositResponse(DepositResponse value) {
        return new JAXBElement<DepositResponse>(_DepositResponse_QNAME, DepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "transaction")
    public JAXBElement<Transaction> createTransaction(Transaction value) {
        return new JAXBElement<Transaction>(_Transaction_QNAME, Transaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "transactionResponse")
    public JAXBElement<TransactionResponse> createTransactionResponse(TransactionResponse value) {
        return new JAXBElement<TransactionResponse>(_TransactionResponse_QNAME, TransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<Withdraw>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "withdrawResponse")
    public JAXBElement<WithdrawResponse> createWithdrawResponse(WithdrawResponse value) {
        return new JAXBElement<WithdrawResponse>(_WithdrawResponse_QNAME, WithdrawResponse.class, null, value);
    }

}
