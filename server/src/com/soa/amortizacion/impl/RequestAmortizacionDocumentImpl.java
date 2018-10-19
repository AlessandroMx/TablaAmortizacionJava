/*
 * An XML document type.
 * Localname: requestAmortizacion
 * Namespace: http://soa.com/amortizacion
 * Java type: com.soa.amortizacion.RequestAmortizacionDocument
 *
 * Automatically generated - do not modify.
 */
package com.soa.amortizacion.impl;
/**
 * A document containing one requestAmortizacion(@http://soa.com/amortizacion) element.
 *
 * This is a complex type.
 */
public class RequestAmortizacionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.amortizacion.RequestAmortizacionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestAmortizacionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTAMORTIZACION$0 = 
        new javax.xml.namespace.QName("http://soa.com/amortizacion", "requestAmortizacion");
    
    
    /**
     * Gets the "requestAmortizacion" element
     */
    public com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion getRequestAmortizacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion target = null;
            target = (com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion)get_store().find_element_user(REQUESTAMORTIZACION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestAmortizacion" element
     */
    public void setRequestAmortizacion(com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion requestAmortizacion)
    {
        generatedSetterHelperImpl(requestAmortizacion, REQUESTAMORTIZACION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestAmortizacion" element
     */
    public com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion addNewRequestAmortizacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion target = null;
            target = (com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion)get_store().add_element_user(REQUESTAMORTIZACION$0);
            return target;
        }
    }
    /**
     * An XML requestAmortizacion(@http://soa.com/amortizacion).
     *
     * This is a complex type.
     */
    public static class RequestAmortizacionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.soa.amortizacion.RequestAmortizacionDocument.RequestAmortizacion
    {
        private static final long serialVersionUID = 1L;
        
        public RequestAmortizacionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MONTOTOTAL$0 = 
            new javax.xml.namespace.QName("http://soa.com/amortizacion", "montoTotal");
        private static final javax.xml.namespace.QName NUMEROPAGOS$2 = 
            new javax.xml.namespace.QName("http://soa.com/amortizacion", "numeroPagos");
        private static final javax.xml.namespace.QName INTERESANUAL$4 = 
            new javax.xml.namespace.QName("http://soa.com/amortizacion", "interesAnual");
        
        
        /**
         * Gets the "montoTotal" element
         */
        public double getMontoTotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTOTOTAL$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "montoTotal" element
         */
        public org.apache.xmlbeans.XmlDouble xgetMontoTotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTOTOTAL$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "montoTotal" element
         */
        public void setMontoTotal(double montoTotal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTOTOTAL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTOTOTAL$0);
                }
                target.setDoubleValue(montoTotal);
            }
        }
        
        /**
         * Sets (as xml) the "montoTotal" element
         */
        public void xsetMontoTotal(org.apache.xmlbeans.XmlDouble montoTotal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTOTOTAL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MONTOTOTAL$0);
                }
                target.set(montoTotal);
            }
        }
        
        /**
         * Gets the "numeroPagos" element
         */
        public int getNumeroPagos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROPAGOS$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numeroPagos" element
         */
        public org.apache.xmlbeans.XmlInt xgetNumeroPagos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROPAGOS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numeroPagos" element
         */
        public void setNumeroPagos(int numeroPagos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROPAGOS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROPAGOS$2);
                }
                target.setIntValue(numeroPagos);
            }
        }
        
        /**
         * Sets (as xml) the "numeroPagos" element
         */
        public void xsetNumeroPagos(org.apache.xmlbeans.XmlInt numeroPagos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROPAGOS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMEROPAGOS$2);
                }
                target.set(numeroPagos);
            }
        }
        
        /**
         * Gets the "interesAnual" element
         */
        public double getInteresAnual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESANUAL$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "interesAnual" element
         */
        public org.apache.xmlbeans.XmlDouble xgetInteresAnual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERESANUAL$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "interesAnual" element
         */
        public void setInteresAnual(double interesAnual)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESANUAL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERESANUAL$4);
                }
                target.setDoubleValue(interesAnual);
            }
        }
        
        /**
         * Sets (as xml) the "interesAnual" element
         */
        public void xsetInteresAnual(org.apache.xmlbeans.XmlDouble interesAnual)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERESANUAL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(INTERESANUAL$4);
                }
                target.set(interesAnual);
            }
        }
    }
}
