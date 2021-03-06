
package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MatrixoperationsWS", targetNamespace = "http://WebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MatrixoperationsWS {


    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://WebService/", className = "webservice.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://WebService/", className = "webservice.SubtractResponse")
    @Action(input = "http://WebService/MatrixoperationsWS/subtractRequest", output = "http://WebService/MatrixoperationsWS/subtractResponse")
    public String subtract(
        @WebParam(name = "a", targetNamespace = "")
        String a,
        @WebParam(name = "b", targetNamespace = "")
        String b);

    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://WebService/", className = "webservice.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://WebService/", className = "webservice.AddResponse")
    @Action(input = "http://WebService/MatrixoperationsWS/addRequest", output = "http://WebService/MatrixoperationsWS/addResponse")
    public String add(
        @WebParam(name = "a", targetNamespace = "")
        String a,
        @WebParam(name = "b", targetNamespace = "")
        String b);

    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://WebService/", className = "webservice.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://WebService/", className = "webservice.MultiplyResponse")
    @Action(input = "http://WebService/MatrixoperationsWS/multiplyRequest", output = "http://WebService/MatrixoperationsWS/multiplyResponse")
    public String multiply(
        @WebParam(name = "a", targetNamespace = "")
        String a,
        @WebParam(name = "b", targetNamespace = "")
        String b);

    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divideR", targetNamespace = "http://WebService/", className = "webservice.DivideR")
    @ResponseWrapper(localName = "divideRResponse", targetNamespace = "http://WebService/", className = "webservice.DivideRResponse")
    @Action(input = "http://WebService/MatrixoperationsWS/divideRRequest", output = "http://WebService/MatrixoperationsWS/divideRResponse")
    public String divideR(
        @WebParam(name = "a", targetNamespace = "")
        String a,
        @WebParam(name = "b", targetNamespace = "")
        String b);

    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divideL", targetNamespace = "http://WebService/", className = "webservice.DivideL")
    @ResponseWrapper(localName = "divideLResponse", targetNamespace = "http://WebService/", className = "webservice.DivideLResponse")
    @Action(input = "http://WebService/MatrixoperationsWS/divideLRequest", output = "http://WebService/MatrixoperationsWS/divideLResponse")
    public String divideL(
        @WebParam(name = "a", targetNamespace = "")
        String a,
        @WebParam(name = "b", targetNamespace = "")
        String b);

}
